import kotlin.random.Random

object List {
    private const val size = 12;

    fun getList(): Set<String> {
        var list = mutableSetOf<String>()

        while (list.count() < this.size) {
            var index = Random.nextInt(0, this.categories.size+1)
            list.add(this.categories[index])
        }

        return list;
    }

    private val categories: Array<String>
        get() {
            return arrayOf(
                "a boy's name",
                "U.S. cities",
                "Things that are Cold",
                "School Supplies",
                "Pro Sports Teams",
                "Insects",
                "Breakfast Foods",
                "Furniture",
                "T.V. Shows",
                "Things that are Found in the Ocean",
                "Presidents",
                "Product Names",
                "Appliances",
                "Types of Drink",
                "Personality Traits",
                "Articles of Clothing",
                "Desserts",
                "Car Parts",
                "Things Found On a Map",
                "Athletes",
                "4-Letter Words",
                "Items in a Refrigerator",
                "Farm Animals",
                "Street Names",
                "Things On a Beach",
                "Colors",
                "Tools",
                "a Girl'S Name",
                "Villains/Monsters",
                "Footwear",
                "Something You'Re Afraid of",
                "Terms of Measurement",
                "Book Titles",
                "Heroes",
                "Gifts/Presents",
                "Kinds of Dances",
                "Things that are Black",
                "Vehicles",
                "Tropical Locations",
                "College Majors",
                "Dairy Products",
                "Things in a Souvenir Shop",
                "Items in Your Purse/Wallet",
                "World Records",
                "Famous Females",
                "Medicine/Drugs",
                "Things Made of Metal",
                "Hobbies",
                "People in Uniform",
                "Things You Plug in",
                "Animals",
                "Languages",
                "Names Used in the Bible",
                "Junk Food",
                "Things that Grow",
                "Companies",
                "Video Games",
                "Electronic Gadgets",
                "Board Games",
                "Things that Use a Remote",
                "Card Games",
                "Internet Lingo",
                "Offensive Words",
                "Wireless Things",
                "Computer Parts",
                "Software",
                "Websites",
                "Game Terms",
                "Things in a Grocery Store",
                "Reasons to Quit Your Job",
                "Things that Have Stripes",
                "Tourist Attractions",
                "Diet Foods",
                "Things Found in a Hospital",
                "Food/Drink that Is Green",
                "Weekend Activities",
                "Acronyms",
                "Seafood",
                "Christmas Songs",
                "Words Ending in -N",
                "Words With Double Letters",
                "Childrens Books",
                "Things Found at a Bar",
                "Sports Played Indoors",
                "Names Used in Songs",
                "Foods You Eat Raw",
                "Places in Europe",
                "Olympic Events",
                "Things You See at the Zoo",
                "Math Terms",
                "Animals in Books or Movies",
                "Things to Do at a Party",
                "Sandwiches",
                "Items in a Catalog",
                "World Leaders/Politicians",
                "School Subjects",
                "Excuses For Being Late",
                "Ice Cream Flavors",
                "Things that Jump/Bounce",
                "Television Stars",
                "Things in a Park",
                "Foreign Cities",
                "Stones/Gems",
                "Musical Instruments",
                "Nicknames",
                "Things in the Sky",
                "Pizza Toppings",
                "Colleges/Universities",
                "Fish",
                "Countries",
                "Things that Have Spots",
                "Historical Figures",
                "Something You're Afraid of",
                "Terms of Endearment",
                "Items in this Room",
                "Fictional Characters",
                "Menu Items",
                "Magazines",
                "Capitals",
                "Kinds of Candy",
                "Items You Save Up to Buy",
                "Footware",
                "Something You Keep Hidden",
                "Items in a Suitcase",
                "Things With Tails",
                "Sports Equipment",
                "Crimes",
                "Things that are Sticky",
                "Awards/Ceremonies",
                "Cars",
                "Spices/Herbs",
                "Bad Habits",
                "Cosmetics/Toiletries",
                "Celebrities",
                "Cooking Utensils",
                "Reptiles/Amphibians",
                "Parks",
                "Leisure Activities",
                "Things You're Allergic To",
                "Restaurants",
                "Notorious People",
                "Fruits",
                "Things in a Medicine Cabinet",
                "Toys",
                "Household Chores",
                "Bodies of Water",
                "Authors",
                "Halloween Costumes",
                "Weapons",
                "Things that are Round",
                "Words Associated With Exercise",
                "Sports",
                "Song Titles",
                "Parts of the Body",
                "Ethnic Foods",
                "Things You Shout",
                "Birds",
                "Ways to Get From Here to There",
                "Items in a Kitchen",
                "Villians",
                "Flowers",
                "Things You Replace",
                "Baby Foods",
                "Famous Duos And Trios",
                "Things Found in a Desk",
                "Vacation Spots",
                "Diseases",
                "Words Associated With Money",
                "Items in a Vending Machine",
                "Movie Titles",
                "Games",
                "Things that You Wear",
                "Beers",
                "Things at a Circus",
                "Vegetables",
                "States",
                "Things You Throw Away",
                "Occupations",
                "Appliances ",
                "Cartoon Characters",
                "Types of Drinks",
                "Musical Groups",
                "Store Names",
                "Things at a Football Game",
                "Trees",
                "Personality Traits",
                "KIndS of Soup",
                "ThIngS found in New York",
                "ThIngS You geT TIcKeTS for",
                "ThIngS You do aT worK",
                "foreIgn wordS uSed In engLISh",
                "ThIngS You ShouLdn'T Touch",
                "SpIcY foodS",
                "ThIngS aT a carnIvaL",
                "ThIngS You maKe",
                "pLaceS To hang ouT",
                "anImaL noISeS",
                "compuTer programS",
                "honeymoon SpoTS",
                "ThIngS you buy for kIdS",
                "ThIngS ThaT can kILL you",
                "reaSonS To Take ouT a Loan",
                "wordS aSSocIaTed wITh wInTer",
                "ThIngS To do on a daTe",
                "hISTorIc evenTS",
                "ThIngS you STore ITemS In",
                "ThIngS you do every day",
                "ThIngS you geT In The maIL",
                "ThIngS you Save up To buy",
                "ThIngS you SIT In/on",
                "reaSonS To make a phone caLL",
                "Types of weather",
                "TITLeS peopLe can have",
                "ThIngS ThaT have buTTonS",
                "ITemS you Take on a TrIp",
                "ThIngS ThaT have wheeLS",
                "reaSonS To caLL 911",
                "ThIngS ThaT make you SmILe",
                "wayS To kILL TIme",
                "ThIngS ThaT can geT you fIred",
                "holiday activities"
            )
        }
}