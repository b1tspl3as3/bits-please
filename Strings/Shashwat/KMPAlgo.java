public class KMPAlgo{

	private static void KMPSearch(String text, String pattern){

		int [] lps = calculateLPS(pattern.toCharArray());
		int j = 0 ;
		int i = 0;

		char [] t = text.toCharArray();
		char [] p = pattern.toCharArray();

		while(i < t.length){
			if(t[i] == p[j]){
				i++;
				j++;
			}

			if(j == p.length){
				System.out.println("Pattern found at index: "+(i-j));
				j = lps[j-1];
			}else if(i< t.length && t[i] != p[j]){
				if(j != 0){
					j = lps[j-1];
				}else{
					i++;
				}
			}
		}
	}

	private static int[] calculateLPS(char [] pat){
		int j = 0; /* j stores the index of the previous character*/
		int i = 1;

		int [] lps = new int[pat.length]; /* lps will be of same length as that of pattern */
		lps[0] = 0; /* no possible proper prefix or proper suffix */

		while( i < pat.length){
			if(pat[j] == pat[i]){
				j++;
				lps[i] = j;
				i++;
			}else{
				if(j!= 0){
					j = lps[j-1];
				}else{
					lps[i] = j;
					i++;
				}
			}
		}

		return lps;
	}



	public static void main(String [] args){
		String text = "SSSXSSS";
		String pattern = "SSS";

		KMPSearch(text, pattern);
	}
}