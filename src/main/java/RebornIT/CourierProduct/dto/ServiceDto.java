package RebornIT.CourierProduct.dto;

import RebornIT.CourierProduct.entity.ServiceProvider;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServiceDto {

    private Long id;
    private String service;
}
