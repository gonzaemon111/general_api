package dev.gonzaemon111.GeneralAPI.interfaces.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class HealthControllerTest {
  @Autowired
  private MockMvc mockMvc;

  @Test
  @DisplayName("リダイレクト")
  void ヘルスチェック() throws Exception {
    mockMvc.perform(MockMvcRequestBuilders.get("/health"))       // ルート「/」に擬似リクエスト送信
        .andExpect(MockMvcResultMatchers.status().isOk());                   // HttpStatus が 200:OK であること;
  }
}
