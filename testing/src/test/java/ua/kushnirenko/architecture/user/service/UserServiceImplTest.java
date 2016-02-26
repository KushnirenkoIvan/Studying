package ua.kushnirenko.architecture.user.service;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.verification.VerificationModeFactory;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import ua.kushnirenko.architecture.user.dao.UserDAO;
import ua.kushnirenko.architecture.user.domain.User;

import static org.mockito.Mockito.*;


/**
 * Simple example of behaviour test for service layer.
 */
@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest extends TestCase {

    private boolean setUpIsDone = false;

    @InjectMocks
    @Autowired
    private UserServiceImpl userService;

    @Mock
    private UserDAO userDAOMock;

    private User testUser;

    @Override
    public void setUp() {
        if (setUpIsDone) {
            return;
        }

        MockitoAnnotations.initMocks(this);

        when(userDAOMock.read(anyLong())).thenReturn(testUser);
        when(userDAOMock.create(any(User.class))).thenReturn(anyLong());

        testUser = new User(123L, "login");

        setUpIsDone = true;
    }

    @Test
    public void testFindUserById() {
        assertEquals(testUser, userService.findUserById(123L));

        verify(userDAOMock, VerificationModeFactory.times(1)).read(anyLong());
    }

    @Test
    public void testSaveNewUser() {
        assertTrue(userService.saveNewUser(testUser));

        verify(userDAOMock, VerificationModeFactory.times(1)).create(testUser);
    }
}