package ua.kushnirenko.mockito.practice;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


/**
 * This class was created for working with mockito documentation.
 */
public class MockitoStudyingPart1 {

    private static Logger log = Logger.getLogger("log4j.logger.ua.kushnirenko.util.TESTListenerLOGGER");

    public void verifyingBehaviour() {
        log.info("Let's verify some behaviour!");

        List mockedList = mock(List.class);

        mockedList.isEmpty();
        mockedList.add(1);
        mockedList.size();
        mockedList.get(1);

        verify(mockedList).add(anyInt());
        verify(mockedList).size();
        verify(mockedList).isEmpty();
        verify(mockedList).get(anyInt());

        log.info("Once created, mock will remember all interactions. \n " +
                "Then you can selectively verify whatever interaction you are interested in.");
    }

    public void stubbing() {
        log.info("Stubbing: ");

        LinkedList mockedList = mock(LinkedList.class);

        when(mockedList.add(any())).thenReturn(true);
        
    }

    public static void main(String[] args) {


    }

}
