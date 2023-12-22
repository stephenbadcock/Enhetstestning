/* Exercise from https://www.vogella.com/tutorials/Mockito/article.html#exercise-testing-an-api-with-mockito-and-junit-5 */

package se.iths;

public class VolumeUtil {
    public static void maximizeVolume(AudioManager audioManager) {
        if (audioManager.getRingerMode() != RINGER_MODE.RINGER_MODE_SILENT) {
            int max = audioManager.getStreamMaxVolume();
            audioManager.setStreamVolume(max);
        }
    }
}