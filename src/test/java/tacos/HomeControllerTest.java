package tacos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import tacos.Controller.HomeController;

@WebMvcTest(HomeController.class)

@Autowired
private MockMvc mockMvc;

@Test
public class HomeControllerTest {
	mockMvc.
}
