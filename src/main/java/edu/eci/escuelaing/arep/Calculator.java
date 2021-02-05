package edu.eci.escuelaing.arep;

public class Calculator {
	private LinkedList lista;
	public Calculator() {
		lista=new LinkedList();
	}
	public Calculator(LinkedList lista ) {
		this.lista = lista;
	}	
    public double mean() {
    	double mean = 0;
    	for(int i=0;i<lista.size();i++) {
    		mean+=lista.getIndex(i);
    	}
    	mean = (mean/lista.size());
    	
    	return mean;
    }
    
    public double standardDeviation() {
    	double sDeviation = 0;
    	double tMean = mean();
    	for(int i=0;i<lista.size();i++) {
    		sDeviation += Math.pow((lista.getIndex(i)-tMean), 2);
    	}
    	sDeviation=sDeviation/lista.size();
    	sDeviation = Math.sqrt(sDeviation);
    	
    	return sDeviation;
    }
}
