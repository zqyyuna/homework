package org.scu.db.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.scu.db.demo.model.Title;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper

public interface TitleMapper {
    List<Title> IandO();
}
