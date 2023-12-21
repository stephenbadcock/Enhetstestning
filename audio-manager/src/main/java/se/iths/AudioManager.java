/* Exercise from https://www.vogella.com/tutorials/Mockito/article.html#exercise-testing-an-api-with-mockito-and-junit-5 */

package se.iths;

public class AudioManager {
    private int volume = 50;
    private RINGER_MODE mode = RINGER_MODE.RINGER_MODE_SILENT;

    public RINGER_MODE getRingerMode() {
        return mode;
    }
    public int getStreamMaxVolume() {
        return volume;
    }
    public void setStreamVolume(int max) {
        volume = max;
    }
}
