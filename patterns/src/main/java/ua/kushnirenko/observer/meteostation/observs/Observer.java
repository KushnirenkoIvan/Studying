package ua.kushnirenko.observer.meteostation.observs;


import ua.kushnirenko.observer.meteostation.dto.MeteoDataDTO;
import ua.kushnirenko.observer.meteostation.subject.impl.Subject;

public interface Observer {

    void update(MeteoDataDTO meteoDataDTO, Subject subject);

}
