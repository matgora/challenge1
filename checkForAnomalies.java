import java.util.*;

/**
   * Checks a Vector of filtered accelerometer data for
   * anomalies above the given threshhold value
   * @param threshhold 
   *	a data value outside this threshhold is an anomaly
   * @param data
   *	a Vector of Doubles, the data to be analysed for anomalies
   * @return
   * 	true if an anomaly is found
   *	false otherwise
   */
private static boolean checkForAnomalies(Double threshold, Vector<Double> data)
{
	//for each value in the data
	for(int i = 0; i <= data.size(); i++)
	{
		//if the data is above the threshhold or below the negative threshhold
		if(data.get(i) > threshold || data.get(i) < -1 * threshold)
		{
			return true;
		}
	}
	//if no data values were found to be anomalies
	return false;
}