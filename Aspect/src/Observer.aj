import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public aspect Observer {
	
	Map<Color, String> getConfig(){
    	Map<Color,String> response = new HashMap<>();
    	response.put(Color.BLUE, "Azul");
    	response.put(Color.RED, "Rojo");
    	response.put(Color.GRAY, "Gris");
    	return response;
    }
	
	Map<Color, String> map = getConfig();
	
	pointcut change (Color color) : args(color) && call( *changeColor* (..) );
	after(Color color): change(color){
		System.out.println(map.get(color));
	}
	
	pointcut clean(): call ( *cleanBackground* (..));
	after(): clean() {
		System.out.println("Cleaned Background");
	}
}
