package jy.project.sungjuk.service;

import jy.project.sungjuk.model.SungJukVO;

public interface SungJukV1bService {

    void newSungJuk();
    void readSungJuk();
    void readOneSungJuk();
    void modifySungJuk();
    void removeSungJuk();
    void computeSungJuk(SungJukVO sj);
    String displayMenu();
    void processMenu(String menu);

}
