package bcit.comp2501.assignment1.justinlouie;

/**
 * @author Justin Louie
 * @version 1.0
 */

public class Address
{
    private final String unitNumber;
    private final int streetNumber;
    private final String streetName;
    private final String postalCode;
    private final String city;

    public static int MIN_UNIT_NUM_CHAR_LENGTH = 1;
    public static int MAX_UNIT_NUM_CHAR_LENGTH = 4;
    public static int MIN_STREET_NUM = 0;
    public static int MAX_STREET_NUM = 999999;
    public static int MIN_STREET_NAME_CHAR_LENGTH = 1;
    public static int MAX_STREET_NAME_CHAR_LENGTH = 20;
    public static int POSTAL_CODE_CHAR_LENGTH_FIRST_OPTION = 5;
    public static int POSTAL_CODE_CHAR_LENGTH_SECOND_OPTION = 6;
    public static int MIN_CITY_NAME_CHAR_LENGTH = 1;
    public static int MAX_CITY_NAME_CHAR_LENGTH = 30;

    /**
     * @param unitNumber : The unit number of the address, if applicable. If there is no unit number, enter 'null'.
     * @param streetNumber : The street number of the address.
     * @param streetName : The street name of the address.
     * @param postalCode : The postal code of the address.
     * @param city : The city in which the address is located.
     * @throws IllegalArgumentException if arguments are not within the given number range or number of character range.
     * @throws NullPointerException if String argument values are null, except for the unit number argument, which can be null.
     */
    public Address(final String unitNumber,
                   final int streetNumber,
                   final String streetName,
                   final String postalCode,
                   final String city)
    {
        if(unitNumber != null)
        {
            if (unitNumber.length() < MIN_UNIT_NUM_CHAR_LENGTH || unitNumber.length() > MAX_UNIT_NUM_CHAR_LENGTH)
            {
                throw new IllegalArgumentException("Invalid unit number: " + unitNumber);
            }
        }

        if (streetNumber < MIN_STREET_NUM || streetNumber > MAX_STREET_NUM)
        {
            throw new IllegalArgumentException("Invalid street number: " + streetNumber);
        }

        if(streetName == null)
        {
            throw new NullPointerException("Invalid street name: " + streetName);
        }

        if (streetName.length() < MIN_STREET_NAME_CHAR_LENGTH || streetName.length() > MAX_STREET_NAME_CHAR_LENGTH)
        {
            throw new IllegalArgumentException("Invalid street name: " + streetName);
        }

        if(postalCode == null)
        {
            throw new NullPointerException("Invalid postal code: " + postalCode);
        }

        if (postalCode.length() != POSTAL_CODE_CHAR_LENGTH_FIRST_OPTION && postalCode.length() != POSTAL_CODE_CHAR_LENGTH_SECOND_OPTION)
        {
            throw new IllegalArgumentException("Invalid postal code: " + postalCode);
        }

        if(city == null)
        {
            throw new NullPointerException("Invalid city: " + city);
        }

        if (city.length() < MIN_CITY_NAME_CHAR_LENGTH || city.length() > MAX_CITY_NAME_CHAR_LENGTH)
        {
            throw new IllegalArgumentException("Invalid city: " + city);
        }


        this.unitNumber = unitNumber;
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.postalCode = postalCode;
        this.city = city;
    }

    /**
     * @return : Returns the unit number.
     */
    public String getUnitNumber()
    {
        return unitNumber;
    }

    /**
     * @return : Returns the street number.
     */
    public int getStreetNumber()
    {
        return streetNumber;
    }

    /**
     * @return : Returns the street name.
     */
    public String getStreetName()
    {
        return streetName;
    }

    /**
     * @return : Returns the postal code.
     */
    public String getPostalCode()
    {
        return postalCode;
    }

    /**
     * @return : Returns the city.
     */
    public String getCity()
    {
        return city;
    }

    /**
     * @return : Returns the street name with the first letter of each word capitalized.
     */
    public String getCapitalizedStreetName()
    {
        if(streetName.contains(" "))
        {
            String[] streetNames;
            streetNames = streetName.split(" ");
            StringBuilder builder;
            builder = new StringBuilder();

            for(final String string : streetNames)
            {
                String firstLetterCapital;
                firstLetterCapital = string.substring(0, 1).toUpperCase();
                String remainingLettersLowerCase;
                remainingLettersLowerCase = string.substring(1).toLowerCase();
                String newStreetName;
                newStreetName = firstLetterCapital + remainingLettersLowerCase;
                builder.append(newStreetName);
                builder.append(" ");
            }
            String capitalStreetName;
            capitalStreetName = builder.toString();
            capitalStreetName = capitalStreetName.strip();
            return capitalStreetName;
        }

        String firstLetterCapital;
        firstLetterCapital = streetName.substring(0,1).toUpperCase();
        String remainingLettersLowerCase;
        remainingLettersLowerCase = streetName.substring(1).toLowerCase();
        String capitalStreetName;
        capitalStreetName = firstLetterCapital + remainingLettersLowerCase;
        return capitalStreetName;
    }

    /**
     * @return : Returns the city name with the first letter of each word capitalized.
     */
    public String getCapitalizedCityName()
    {
        if(city.contains(" "))
        {
            String[] cityNames;
            cityNames = city.split(" ");
            StringBuilder builder;
            builder = new StringBuilder();

            for(final String string : cityNames)
            {
                String firstLetterCapital;
                firstLetterCapital = string.substring(0, 1).toUpperCase();
                String remainingLettersLowerCase;
                remainingLettersLowerCase = string.substring(1).toLowerCase();
                String newCityName;
                newCityName = firstLetterCapital + remainingLettersLowerCase;
                builder.append(newCityName);
                builder.append(" ");
            }
            String capitalCityName;
            capitalCityName = builder.toString();
            capitalCityName = capitalCityName.strip();
            return capitalCityName;
        }

        String firstLetterCapital;
        firstLetterCapital = city.substring(0,1).toUpperCase();
        String remainingLettersLowerCase;
        remainingLettersLowerCase = city.substring(1).toLowerCase();
        String capitalCityName;
        capitalCityName = firstLetterCapital + remainingLettersLowerCase;
        return capitalCityName;
    }
}
