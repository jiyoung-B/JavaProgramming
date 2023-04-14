package jy.project.sungjuk.dao;

import jy.project.sungjuk.model.SungJukVO;

import java.util.List;

public interface SungJukV3DAO {
    boolean saveSungJuk(SungJukVO sj);

    List<SungJukVO> loadSungJuk();
}
