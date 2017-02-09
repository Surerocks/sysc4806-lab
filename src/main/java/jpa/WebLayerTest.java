/*package jpa;

import org.h2.server.web.WebApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by craigshorrocks on 2/9/2017.

@RunWith(SpringRunner.class)
@WebMvcTest
public class WebLayerTest {


    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AddressBookController controller;

    @Test
    public void createAddressBookTest() throws Exception {
        this.mockMvc.perform(put("/book")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Address")));
    }
} */
