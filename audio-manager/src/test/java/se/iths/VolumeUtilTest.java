/* Exercise from https://www.vogella.com/tutorials/Mockito/article.html#exercise-testing-an-api-with-mockito-and-junit-5 */

package se.iths;

import org.mockito.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VolumeUtilTest {
    @Mock
    private AudioManager audioManagerMock;

    @BeforeEach
    public void setup() {
        audioManagerMock = mock(AudioManager.class);
    }

    @Test
    void testNormalRingerIsMaximized(){
        // 1.) Ensure AudioManager gets mocked
        // 2.) configure Audiomanager to return RINGER_MODE_NORMAL if getRinderMode is called
        when(audioManagerMock.getRingerMode()).thenReturn(RINGER_MODE.RINGER_MODE_NORMAL);
        // 3.) configure Audiomanager to return 100 if getStreamMaxVolume() is called
        when(audioManagerMock.getStreamMaxVolume()).thenReturn(100);
        // 4.) call VolumeUtil.maximizeVolume with Audiomanager -> code under test
        VolumeUtil.maximizeVolume(audioManagerMock);
        // 5.) verify that setStreamVolume(100) was called on audioManager
        verify(audioManagerMock).setStreamVolume(100);
    }

    @Test
    void testSilentRingerIsNotDisturbed() {
        // 1.) Ensure AudioManager gets mocked
        // 2.) configure audiomanager to return "RINGER_MODE_SILENT" if getRingerMode is called
        when(audioManagerMock.getRingerMode()).thenReturn(RINGER_MODE.RINGER_MODE_SILENT);
        // 3.) call VolumeUtil.maximizeVolume with audio manager
        VolumeUtil.maximizeVolume(audioManagerMock);
        // 4.) verify that getRingerMode() is called on the mock
        verify(audioManagerMock).getRingerMode();
        // 5.) Ensure that nothing more was called
        verify(audioManagerMock, only()).getRingerMode();
        // Note: This test will fail using original code. Find the error in VolumeUtil() and correct it to make test pass.
    }
}
