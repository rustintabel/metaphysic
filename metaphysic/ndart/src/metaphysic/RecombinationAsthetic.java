/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metaphysic;

/**
 *
 * @author justin
 */
public abstract class RecombinationAsthetic extends Asthetic {
public void readWikipedia(String[] url) {
    URL url;
    InputStream is = null;
    BufferedReader br;
    String line;

    try {
        url = new URL("http://wikipedia.com/");
        is = url.openStream();  // throws an IOException
        br = new BufferedReader(new InputStreamReader(is));

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    } catch (MalformedURLException mue) {
         mue.printStackTrace();
    } catch (IOException ioe) {
         ioe.printStackTrace();
    } finally {
        try {
            is.close();
        } catch (IOException ioe) {
            // nothing to see here
        }
    }
}
}
