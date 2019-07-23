package com.czbank.integralservice.dao;

import com.czbank.integralservice.domain.Completion;
import com.czbank.integralservice.domain.CompletionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompletionMapper {
    int countByExample(CompletionExample example);

    int deleteByExample(CompletionExample example);

    int insert(Completion record);

    int insertSelective(Completion record);

    List<Completion> selectByExample(CompletionExample example);

    int updateByExampleSelective(@Param("record") Completion record, @Param("example") CompletionExample example);

    int updateByExample(@Param("record") Completion record, @Param("example") CompletionExample example);
}