package ru.netology.stats;

public class StatisticsService {

    /**
     * Calculate index of max income
     *
     * @param incomes - array of incomes
     * @return - index of first max value
     */
    public long findMax(long[] incomes) {
        long current_max = incomes[0];
        for (long income : incomes)
            if (current_max < income)
                current_max = income;
        System.out.println(current_max);
        return current_max;
    }
}
