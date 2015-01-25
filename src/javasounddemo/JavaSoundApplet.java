package javasounddemo;


/*
 *   I am Ahmed Reda Mahfouz
 *   Student at the Faculty of Computing and Information Menoufia University 
 *   Department of Computer Science
 *   Capture/Playback sample.  Record audio in different formats
 *   and then playback the recorded audio.  The captured audio can 
 *   be saved either as a WAVE, AU or AIFF.  Or load an audio file
 *   for streaming playback. 
 *   A demo that shows JavaSound features. 
 *
 *   Parameters that can be used in the JavaSound.html file inside
 *   the applet tag to customize demo runs :
 *            <param name="dir" value="audioDirectory">
 * *
 *   *       Please Visit us at www.github.com/amahfouz50     *
 *  This Program was Developed by www.github.com/amahfouz50 forums Team
 *  *           Please Don't Remove This Comment       *
 */  

/**
 *
 *   @author Ahmed Mahfouz
 */

import javax.swing.JApplet;


public class JavaSoundApplet extends JApplet {

    static JavaSoundApplet applet;
    private JavaSound demo;

    public void init() {
        applet = this;
        String media = "./audio";
        String param = null;
        if ((param = getParameter("dir")) != null) {
            media = param;
        } 
        getContentPane().add("Center", demo = new JavaSound(media));
    }

    public void start() {
        demo.open();
    }

    public void stop() {
        demo.close();
    }
}
