import java.util.Arrays;

public class OTPGenerator {

    // Method to generate a 6-digit OTP using Math.random()
    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000; // Generates between 100000 and 999999
    }

    // Method to generate and store 10 OTPs in an array
    public static int[] generateMultipleOTPs(int count) {
        int[] otps = new int[count];
        for (int i = 0; i < count; i++) {
            otps[i] = generateOTP();
        }
        return otps;
    }

    // Method to check if all OTPs are unique
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otpArray = generateMultipleOTPs(10);

        System.out.println("Generated OTPs: " + Arrays.toString(otpArray));

        if (areOTPsUnique(otpArray)) {
            System.out.println("✅ All OTPs are unique.");
        } else {
            System.out.println("❌ Duplicate OTPs found.");
        }
    }
}
