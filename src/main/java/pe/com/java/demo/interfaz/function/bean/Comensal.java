package pe.com.java.demo.interfaz.function.bean;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Comensal {
    String nombre;
    double monto_pedido;
    int mesa;
}
