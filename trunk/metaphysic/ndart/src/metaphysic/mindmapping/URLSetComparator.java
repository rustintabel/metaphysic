package metaphysic.mindmapping;

import java.util.Comparator;

/**
 *
 * @author justin
 */
public class URLSetComparator implements Comparator {

	/**
     *
     * @param arg0
     * @param arg1
     * @return
     */
    public int compare(Object arg0, Object arg1) {
		URLSet set1=(URLSet)arg0;
		URLSet set2=(URLSet)arg1;
		if(set1.rank<set2.rank)
		{
			return -1;
		}
		else if(set1.rank>set2.rank)
		{
			return 1;
		}
		else
		{
			return 0;
		}
		
	}

}
