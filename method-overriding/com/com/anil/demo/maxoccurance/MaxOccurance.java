package com.anil.demo.maxoccurance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaxOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] webSites = { "Google", "Fb", "Fb", "Instagram", "Instagram", "Bb", "Bb", "A", "A", "Bb", "Fb", "Fb" };

		List<String> list = new ArrayList<String>(Arrays.asList(webSites));

		Set<String> set = new HashSet<String>(list);
		List<String> sameFreqWebSites = new ArrayList<String>();

		int maxFreq = 0;
		int sameFreq = 0;
		int currFreq = -1;
		String popolarWebSite = "";

		for (String s : set) {

			currFreq = Collections.frequency(list, s);

			if (currFreq == maxFreq) {
				if (sameFreqWebSites.size() == 0)
					sameFreqWebSites.add(popolarWebSite);
				sameFreqWebSites.add(s);
				sameFreq = currFreq;
			} else if (currFreq > maxFreq) {
				popolarWebSite = s;
				maxFreq = currFreq;
			}
		}

		if (sameFreq >= maxFreq) {
			Collections.sort(sameFreqWebSites);
			System.out.println(sameFreqWebSites.get(0));
		} else {
			System.out.println(popolarWebSite);
		}
	}

}
