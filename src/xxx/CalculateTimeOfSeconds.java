package xxx;

//請由程式算出256559秒為多少天、多少小時、多少分與多少秒
public class CalculateTimeOfSeconds {
	public static void main(String[] args) {
		int ttlSecs = 256559, dOfHrs = 24, hOfMins = 60, mOfSecs = 60;
		// 一天幾秒鐘, 一小時幾秒鐘
		int daySec = dOfHrs * hOfMins * mOfSecs, hrsSec = hOfMins * mOfSecs;
		// 剩餘多少小時秒, 剩餘多少分鐘秒, 剩餘多少秒
		int hrsleft = ttlSecs % daySec, minleft = hrsleft % hrsSec, secleft = minleft % mOfSecs;

		System.out.println("256559秒為" + (ttlSecs / daySec) + "天" + (hrsleft / hrsSec) + "小時" + (minleft / mOfSecs) + "分"
				+ secleft + "秒");
	}
}
