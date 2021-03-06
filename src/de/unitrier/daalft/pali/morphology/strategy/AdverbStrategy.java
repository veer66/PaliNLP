package de.unitrier.daalft.pali.morphology.strategy;

import java.util.ArrayList;
import java.util.List;

import de.unitrier.daalft.pali.morphology.element.ConstructedWord;
import de.unitrier.daalft.pali.morphology.element.Feature;

public class AdverbStrategy extends AbstractStrategy {

	@Override
	public List<ConstructedWord> apply(String lemma, String... options) {
		List<ConstructedWord> out = new ArrayList<ConstructedWord>();
		ConstructedWord cw = new ConstructedWord(lemma);
		cw.addInfo(new Feature("paradigm", "adverb"));
		cw.addInfo(new Feature("subtype", "indeclinable"));
		out.add(cw);
		return out;
	}

}
