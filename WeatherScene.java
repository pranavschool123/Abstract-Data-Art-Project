import org.code.theater.*;

public class WeatherScene extends Scene {

    private int[] temperatures;
    private int hotDays;
    private int moderateDays;
    private int coldDays;

    public WeatherScene(int[] temperatures) {
        this.temperatures = temperatures;
        hotDays = 0;
        moderateDays = 0;
        coldDays = 0;
    }

    public void analyzeData() {
        for (int temp : temperatures) {
            if (temp > 85) {
                hotDays++;
            } else if (temp >= 60) {
                moderateDays++;
            } else {
                coldDays++;
            }
        }
    }

    public void drawResults() {
        setFillColor("red");
        drawRectangle(50, 100, hotDays * 20, 50);
        drawText("Hot Days", 50, 90);

        setFillColor("yellow");
        drawRectangle(50, 200, moderateDays * 20, 50);
        drawText("Moderate Days", 50, 190);

        setFillColor("blue");
        drawRectangle(50, 300, coldDays * 20, 50);
        drawText("Cold Days", 50, 290);
    }
}