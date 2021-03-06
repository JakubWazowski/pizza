package pl.jakub.pizza.remote.rest.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.jakub.pizza.remote.rest.dto.response.MenuDto;

import java.math.BigDecimal;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@RequestMapping( value = "/api/v1/menu", produces = APPLICATION_JSON_VALUE)
@RestController
public class MenuController {
    @GetMapping
    public ResponseEntity<MenuDto> getMenu(){
        
        return ResponseEntity.ok(null);
    }

}
