package cn.whxlover.mapper;

import cn.whxlover.pojo.Meeting;
import cn.whxlover.pojo.MeetingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetingMapper {
    int countByExample(MeetingExample example);

    int deleteByExample(MeetingExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(Meeting record);

    int insertSelective(Meeting record);

    List<Meeting> selectByExample(MeetingExample example);

    Meeting selectByPrimaryKey(Integer mid);

    int updateByExampleSelective(@Param("record") Meeting record, @Param("example") MeetingExample example);

    int updateByExample(@Param("record") Meeting record, @Param("example") MeetingExample example);

    int updateByPrimaryKeySelective(Meeting record);

    int updateByPrimaryKey(Meeting record);
}