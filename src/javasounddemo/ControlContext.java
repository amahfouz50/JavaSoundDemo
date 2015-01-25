package javasounddemo;

/*
 *   I am Ahmed Reda Mahfouz
 *   Student at the Faculty of Computing and Information Menoufia University 
 *   Department of Computer Science
 *   Capture/Playback sample.  Record audio in different formats
 *   and then playback the recorded audio.  The captured audio can 
 *   be saved either as a WAVE, AU or AIFF.  Or load an audio file
 *   for streaming playback.
 *
 *   *       Please Visit us at www.github.com/amahfouz50     *
 *  This Program was Developed by www.github.com/amahfouz50 forums Team
 *  *           Please Don't Remove This Comment       *
 */  

/**
 *
 *   @author Ahmed Mahfouz
 */

public interface ControlContext {
        public void open();
        public void close();
}
