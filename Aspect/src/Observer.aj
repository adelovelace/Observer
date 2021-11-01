import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public aspect Observer {
	
	Map<Color, String> getConfig(){
    	Map<Color,String> response = new HashMap<>();
    	response.put(new Color(128, 206, 225), "Azul");
    	response.put(new Color(255, 105, 97), "Rojo");
    	response.put(new Color(163, 231, 214), "Gris");
    	return response;
    }
	
	Map<Color, String> map = getConfig();
	
	pointcut change (Color color) : args(color) && call(* changeColor*(..));
	after(Color color): change(color){
		System.out.println(map.get(color));
	}
	
	pointcut clean(): call (* cleanBackground*(..));
	after(): clean() {
		System.out.println("Cleaned Background");
	}
}
