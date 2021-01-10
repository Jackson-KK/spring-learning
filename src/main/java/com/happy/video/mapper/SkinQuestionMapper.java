package com.happy.video.mapper;

import com.happy.video.pojo.SkinQuestion;
import com.happy.video.pojo.SkinQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkinQuestionMapper {
    int countByExample(SkinQuestionExample example);

    int deleteByExample(SkinQuestionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SkinQuestion record);

    int insertSelective(SkinQuestion record);

    List<SkinQuestion> selectByExample(SkinQuestionExample example);

    SkinQuestion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SkinQuestion record, @Param("example") SkinQuestionExample example);

    int updateByExample(@Param("record") SkinQuestion record, @Param("example") SkinQuestionExample example);

    int updateByPrimaryKeySelective(SkinQuestion record);

    int updateByPrimaryKey(SkinQuestion record);
}