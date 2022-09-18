package net.datafaker;

/**
 * @since 0.8.0
 */
public class Shakespeare extends AbstractProvider<IProviders> {

    private static final String[] hamletQuotes = {
        "To be, or not to be: that is the question.",
        "Neither a borrower nor a lender be; For loan oft loses both itself and friend, and borrowing dulls the edge of husbandry.",
        "This above all: to thine own self be true.",
        "Though this be madness, yet there is method in 't.",
        "That it should come to this!.",
        "There is nothing either good or bad, but thinking makes it so.",
        "What a piece of work is man! how noble in reason! how infinite in faculty! in form and moving how express and admirable! in action how like an angel! in apprehension how like a god! the beauty of the world, the paragon of animals! .",
        "The lady doth protest too much, methinks.",
        "In my mind's eye.",
        "A little more than kin, and less than kind.",
        "The play 's the thing wherein I'll catch the conscience of the king.",
        "And it must follow, as the night the day, thou canst not then be false to any man.",
        "Brevity is the soul of wit.",
        "Doubt that the sun doth move, doubt truth to be a liar, but never doubt I love.",
        "Rich gifts wax poor when givers prove unkind.",
        "Do you think I am easier to be played on than a pipe?",
        "I will speak daggers to her, but use none.",
        "When sorrows come, they come not single spies, but in battalions."};

    private static final String[] asYouLikeItQuotes = {
        "All the world 's a stage, and all the men and women merely players. They have their exits and their entrances; And one man in his time plays many parts.",
        "Can one desire too much of a good thing?.",
        "I like this place and willingly could waste my time in it.",
        "How bitter a thing it is to look into happiness through another man's eyes!",
        "Blow, blow, thou winter wind! Thou art not so unkind as man's ingratitude.",
        "True is it that we have seen better days.",
        "For ever and a day.",
        "The fool doth think he is wise, but the wise man knows himself to be a fool."};

    private static final String[] kingRichardIIIQuotes = {
        "Now is the winter of our discontent.",
        "A horse! a horse! my kingdom for a horse!.",
        "Conscience is but a word that cowards use, devised at first to keep the strong in awe.",
        "So wise so young, they say, do never live long.",
        "Off with his head!",
        "An honest tale speeds best, being plainly told.",
        "The king's name is a tower of strength.",
        "The world is grown so bad, that wrens make prey where eagles dare not perch."};

    private static final String[] romeoAndJulietQuotes = {
        "O Romeo, Romeo! wherefore art thou Romeo?.",
        "It is the east, and Juliet is the sun.",
        "Good Night, Good night! Parting is such sweet sorrow, that I shall say good night till it be morrow.",
        "What's in a name? That which we call a rose by any other name would smell as sweet.",
        "Wisely and slow; they stumble that run fast.",
        "Tempt not a desperate man.",
        "For you and I are past our dancing days.",
        "O! she doth teach the torches to burn bright.",
        "It seems she hangs upon the cheek of night like a rich jewel in an Ethiope's ear.",
        "See, how she leans her cheek upon her hand! O that I were a glove upon that hand, that I might touch that cheek!.",
        "Not stepping o'er the bounds of modesty."};

    protected Shakespeare(BaseFaker faker) {
        super(faker);
    }

    public String hamletQuote() {
        return randomElement(hamletQuotes);
    }

    public String asYouLikeItQuote() {
        return randomElement(asYouLikeItQuotes);
    }

    public String kingRichardIIIQuote() {
        return randomElement(kingRichardIIIQuotes);
    }

    public String romeoAndJulietQuote() {
        return randomElement(romeoAndJulietQuotes);
    }

    private String randomElement(String[] values) {
        return values[faker.random().nextInt(values.length)];
    }

}
