//package com.microservices.productservice;
//
//import com.microservices.productservice.dto.ProductRequest;
//import com.microservices.productservice.repository.ProductRepository;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.DynamicPropertyRegistry;
//import org.springframework.test.context.DynamicPropertySource;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.testcontainers.containers.MongoDBContainer;
//import org.testcontainers.junit.jupiter.Container;
//import org.testcontainers.junit.jupiter.Testcontainers;
//import org.testcontainers.shaded.com.fasterxml.jackson.core.JsonProcessingException;
//import org.testcontainers.shaded.com.fasterxml.jackson.databind.ObjectMapper;
//
//import java.math.BigDecimal;
//
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@Testcontainers
//@AutoConfigureMockMvc
//@SpringBootTest
//class ProductServiceApplicationTests {
//
//    @Container
//    static MongoDBContainer mongoDBContainer = new MongoDBContainer("mongo:4.4.2");
//
//    @Autowired
//    private ProductRepository productRepository;
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Autowired
//    private ObjectMapper objectMapper;
//
//
//    @DynamicPropertySource
//    static void setProperties(DynamicPropertyRegistry dynamicPropertyRegistry) {
//        dynamicPropertyRegistry.add("spring.data.mongodb.uri", mongoDBContainer::getReplicaSetUrl);
//    }
//
//    @Test
//    void shouldCreateProduct() throws Exception {
//
//        ProductRequest productRequest = getProductRequests();
//
//        String productRequestString = objectMapper.writeValueAsString(productRequest);
//        mockMvc.perform(MockMvcRequestBuilders.post("/api/product")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(productRequestString))
//                .andExpect(status().isCreated());
//        Assertions.assertEquals(1, productRepository.findAll().size());
//    }
//
//    private ProductRequest getProductRequests() {
//        return ProductRequest.builder()
//                .name("Iphone 14")
//                .description("Apple Iphone")
//                .price(BigDecimal.valueOf(1200))
//                .build();
//    }
//}
