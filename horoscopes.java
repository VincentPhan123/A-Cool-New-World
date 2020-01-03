import java.util.*;

public class horoscopes {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Hello this is a Horoscope reader!");
        System.out.println("Enter the month that you were born in: ");
        String month = reader.next();
        System.out.println("Enter what day you were born on: ");
        int day = reader.nextInt();
        horoscope(month, day);
    }

    static void horoscope(String month, int day){
        String sign = "";
        String horoscope = "";

        if (month.equals("January")) {
            if (day < 20)
                sign = "Capricorn";
            else
                sign = "Aquarius";
        } else if (month.equals("February")) {
            if (day < 19)
                sign = "Aquarius";
            else
                sign = "Pisces";
        } else if(month.equals("March")){
            if (day < 21)
                sign = "Pisces";
            else
                sign = "Aries";
        } else if (month.equals("April")){
            if (day < 20)
                sign = "Aries";
            else
                sign = "Taurus";
         } else if (month.equals("May")) {
            if (day < 21)
                sign = "Taurus";
            else
                sign = "Gemini";
        } else if( month.equals("June")) {
            if (day < 21)
                sign = "Gemini";
            else
                sign = "Cancer";
        } else if (month.equals("July")) {
            if (day < 23)
                sign = "Cancer";
            else
                sign = "Leo";
        } else if( month.equals("August")) {
            if (day < 23) 
                sign = "Leo"; 
            else
                sign = "Virgo";
        } else if (month.equals("September")) {
            if (day < 23)
                sign = "Virgo";
            else
                sign = "Libra";
        } else if (month.equals("October")) {
            if (day < 23)
                sign = "Libra";
            else
                sign = "Scorpio";
        } else if (month.equals("November")) {
            if (day < 22)
                sign = "scorpio";
            else
                sign = "Sagittarius";
        } else if (month.equals("December")) {  
            if (day < 22)
                sign = "Sagittarius"; 
            else
                sign ="Capricorn";
      }
      if(sign.equals("Aries")){
        horoscope = "You have a lot of charm and tremendous social skills, Aries. This is an unbeatable combination, and is especially strengthened with the current astral energy. Be sure to go the extra mile today, even if you aren't in the mood to do so. Someone in a position of power and authority may ask you to join him or her for dinner, or perhaps you'll be invited to \"perform\" at a party. These are ideal opportunities to showcase your talents, so embrace them rather than shy away from them.";
      }else if(sign.equals("Taurus")){
          horoscope = "Jan 3, 2020 - This is a day when you could greatly benefit from spending some time outdoors in quiet reflection, Taurus. Even a half-hour's walk through a city park will help you feel more rested and grounded. You have been working especially hard lately, and need some time to refill the well of your soul. Don't deny yourself some downtime. Otherwise, you're at risk of burning out.";
      }else if(sign.equals("Gemini")){
          horoscope = "You're a hard and conscientious worker, Gemini, and sometimes you work so hard that you neglect to take any time for yourself. This is admirable in the short run, but not so wise in the long run. You do no one any good if you burn out from sheer exhaustion. You must learn how to pace yourself and balance your life in such a way that there is ample time for work, play, and meditation.";
      }else if(sign.equals("Cancer")){
          horoscope = "Jan 3, 2020 - Today may find you longing for some spots of color in your life, Cancer. Do what you can to brighten up your home environment. Even buying a few flowering plants and some colorful scatter rugs and artwork will make a world of difference. You don't have to spend a lot of money to brighten your home and lift your spirits. Bake some chocolate chip cookies as well. That can't help but make the place feel more homey and welcoming. Besides, it's hard to be grumpy when you're sporting a milk moustache!";
      }else if(sign.equals("Leo")){
          horoscope = "Jan 3, 2020 - Today you may discover that you have more in common with your neighbors than you thought, Leo. It's likely that some sort of local event has brought all your neighbors together under one roof. You go as an obligation, but stay out of interest and a genuine willingness to participate. There is nothing like rolling up one's sleeves and working together to tackle a common goal. Expect to make some good friends in the process.";
      }else if(sign.equals("Virgo")){
          horoscope = "Jan 3, 2020 - You may receive some kind of windfall today, Virgo. It may be that a rich old relative dies and leaves you some unexpected cash. Or perhaps an investment is paying off better than you dared hope. This is just what you need to perk up your spirits! Be smart about how you handle this money. Our suggestion is that you eschew short-term gratification in favor of long-term security. You'll thank us in a few years' time.";
      }else if(sign.equals("Libra")){
          horoscope = "Romance is very much highlighted today, Libra. All the planetary energies indicate that you and your partner are operating on precisely the same wavelength. It's no wonder that the two of you have been getting along so well lately. Perhaps it's time to take the next important step in your relationship. No matter at what stage you are, there is always a higher plane to aspire to. Begin now and you can be assured that you will both enjoy the altitude.";
      }else if(sign.equals("Scorpio")){
          horoscope = "Jan 3, 2020 - Anything you attempt to do today is likely to turn out really well, Scorpio. You have an ambitious nature, so by all means take advantage of these auspicious conditions to pursue your career-related goals. You will find that you have strong focus and a clear understanding of what needs to be done in order to get ahead. Go ahead and get started. There is absolutely nothing holding you back.";
      }else if(sign.equals("Sagittarius")){
          horoscope = "Jan 3, 2020 - Today you'll likely find that you begin to make real progress on a project that may have been stagnating for a while, Sagittarius. You can't help but feel gratified that all of your hard work is finally beginning to pay off. Good for you! You have earned every success that is due to come your way. But don't rest on your laurels! Continue to work hard so that you can achieve even greater recognition.";
      }else if(sign.equals("Capricorn")){
          horoscope = "Jan 3, 2020 - Today you'll likely awake, look around your home environment, and realize that there is much room for improvement. Fortunately, you are just the person for the job, Capricorn! You are creative and have tremendous decorating talent (even if you don't realize it). Since it's likely that you will have some visitors this evening, why not spend the day reorganizing and sprucing up your home. Add homey touches with groupings of framed family photographs on one table and a favorite collection on another. It doesn't take money to make a home feel welcoming, just love";
      }else if(sign.equals("Aquarius")){
          horoscope = "You are a hard and conscientious worker, Aquarius, and certainly have been applying your skills and doing your best for some time now. The time is ripe for you to reap some benefits from all your efforts. The good news is that all signs indicate that a big career leap is just around the corner for you. Continue to work hard and be patient and soon it will all prove worthwhile.";
      }else if(sign.equals("Pisces")){
          horoscope = "You may find yourself thinking of looking for a new job in order to increase your income, Pisces. But there is probably no need to take such a drastic step. It's possible that your boss has been considering giving you a raise - you may soon be pleasantly surprised. If your money concerns are only short-term, consider asking a family member for a loan at a low interest rate. Once you're back on your feet, you'll be able to pay it off in no time.";
      }

      System.out.println("You are a " + sign + "\nYour horoscope is:\n" + horoscope);
    }    
}
