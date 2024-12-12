import org.code.theater.*;

public class TheaterRunner {
  public static void main(String[] args) {

    int[] temperatures = FileReader.toIntArray("weatherdata.txt");

    WeatherScene scene = new WeatherScene(temperatures);

    scene.analyzeData();
    scene.drawResults();

    Theater.playScenes(scene);
  }
}