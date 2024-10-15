package org.pgm.todopro.mapper;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.pgm.todopro.dto.TodoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;
import java.util.Date;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")
public class TodoMapperTest {
    @Autowired(required = false)
    private TodoMapper todoMapper;

    @Test
    public void testGetTime() {
        log.info(todoMapper);
        log.info(todoMapper.getTime());
    }
    @Test
    public void testInsert() throws Exception {
        TodoDTO dto=new TodoDTO();
        dto.setTitle("2222");
        dto.setDueDate(LocalDate.now());
        dto.setWriter("hong");
        //todoMapper.insert(dto);
    }
}
