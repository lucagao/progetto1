package com.example.restservice;

public class Average {
		
		private int operatore1;
		private int operatore2;
		
		public Average(int operatore1, int operatore2) {
			super();
			this.operatore1 = operatore1;
			this.operatore2 = operatore2;
		}

		public int getOperatore1() {
			return operatore1;
		}

		public void setOperatore1(int operatore1) {
			this.operatore1 = operatore1;
		}

		public int getOperatore2() {
			return operatore2;
		}

		public void setOperatore2(int operatore2) {
			this.operatore2 = operatore2;
		}
		
		public int addizione(int op1, int op2) {
			return op1 + op2;
		}
		public int sottrazione(int op1, int op2) {
			return op1 - op2;
		}
		public int moltiplicazione(int op1, int op2) {
			return op1 * op2;
		}
		public int divisione(int op1, int op2) {
			return op1 / op2;
		}
}
	

