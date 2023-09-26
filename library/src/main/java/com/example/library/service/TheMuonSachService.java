package com.example.library.service;

import com.example.library.model.Sach;
import com.example.library.model.TheMuonSach;
import com.example.library.repository.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TheMuonSachService implements ITheMuonSachService{
    ITheMuonSachRepository iTheMuonSachRepository = new TheMuonSachRepository();
    @Override
    public List<TheMuonSach> displayTheMuonSach() {
        return iTheMuonSachRepository.displayTheMuon();
    }
}
