package a2_2201040018;

public class PCReport {
    public String displayReport(PC[] objs) {
        StringBuilder report = new StringBuilder();

        // Header
        report.append("---------------------------------------------------------------------------------------------------\n");
        report.append("                                           PCPROG REPORT\n");
        report.append("---------------------------------------------------------------------------------------------------\n");

        // Data rows
        final int maxCompsListLength = 50;

        for (int i = 0; i < objs.length; i++) {
            PC pc = objs[i];
            report.append(String.format("%3d", i + 1));
            report.append(" ");
            report.append(String.format("%20s", pc.getModel()));
            report.append(" ");
            report.append(String.format("%6d", pc.getYear()));
            report.append(" ");
            report.append(String.format("%15s", pc.getManufacturer()));

            String compsList = String.join(", ", pc.getComps());
            if (compsList.length() > maxCompsListLength) {
                compsList = compsList.substring(0, maxCompsListLength - 4) + "...";
            }

            report.append(" [");
            report.append(compsList);
            report.append("]");
            report.append("\n");
        }

        // Footer
        report.append("---------------------------------------------------------------------------------------------------\n");

        return report.toString();
    }

}
