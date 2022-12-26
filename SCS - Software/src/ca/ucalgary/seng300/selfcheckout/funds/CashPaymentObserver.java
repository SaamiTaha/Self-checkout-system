package ca.ucalgary.seng300.selfcheckout.funds;

import java.math.BigDecimal;

/*
 * Simple interface for observers of card payment
 */
public interface CashPaymentObserver {

	/*
	 * 
	 * Notifies observer that funds have been registered
	 */
	void fundsRegistered(BigDecimal totalFunds);

	/*
	 * Notifies observer that enough cash has been inserted
	 */
	void enoughCashInserted();
	/**
	 * partial payment is done so receipt can be printed now
	 */
	public void partialPayment();
	/*
	 * Notifies observer that all requested change was able to be returned
	 */
	public void  allChangeReturned();
	
	/*
	 * Notifies observer that some change was returned (due to not being enough
	 * banknotes or coins)
	 * 
	 * @param the remaining amount for which change could not be produced
	 */
	public void partialChangeReturned(BigDecimal credit);
	
	/*
	 * Notifies observer that an error occured when trying to return change (ex: coin tray is full, not enough coins, etc)
	 */
	public void hardwareError();
}
