package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	public void countIn(int in) {
	if (!callCheck() && in > peekaboo())
		totalRejected++;
	else
		super.countIn(in);
	}
}
//edytowany plik DefaultCountingOutRhymer, FIFORhymer, HanoiRhymer
//plik sprawdzony pod zwględem błędów formatowania
//komentarz dodany 30.04.2022r dąbrowicz weronika