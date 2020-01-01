package cn.whxlover.util;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

import javazoom.spi.mpeg.sampled.file.MpegAudioFileReader;

public class convert {

	public static boolean convertMP32Pcm(String mp3filepath, String pcmfilepath){
        try {
            
            AudioInputStream audioInputStream = getPcmAudioInputStream(mp3filepath);
            AudioSystem.write(audioInputStream, AudioFileFormat.Type.WAVE, new File(pcmfilepath));
            return true;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }
    
    private static AudioInputStream getPcmAudioInputStream(String mp3filepath) {
        File mp3 = new File(mp3filepath);
        AudioInputStream audioInputStream = null;
        AudioFormat targetFormat = null;
        try {
            AudioInputStream in = null;

            //读取音频文件的类
            in = new MpegAudioFileReader().getAudioInputStream(mp3);
//            MpegAudioFileReader mp = new MpegAudioFileReader();
//            in = mp.getAudioInputStream(mp3);
            AudioFormat baseFormat = in.getFormat();


            targetFormat = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, baseFormat.getSampleRate(), 16,
                    baseFormat.getChannels(), baseFormat.getChannels() * 2, baseFormat.getSampleRate(), false);

           
            audioInputStream = AudioSystem.getAudioInputStream(targetFormat, in);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return audioInputStream;
    }
}
