package com.example.library.repository;

import com.example.library.model.Sach;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public interface ISachRepository{
    List<Sach> displayBook();
}
