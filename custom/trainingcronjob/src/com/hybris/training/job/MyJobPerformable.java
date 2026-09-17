package com.hybris.training.job;

import com.hybris.training.model.HelloWorldCronJobModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.i18n.L10NService;

public class MyJobPerformable extends AbstractJobPerformable<HelloWorldCronJobModel>
{
    private L10NService l10nService;


    public void setL10nService(final L10NService l10nService)
    {
        this.l10nService = l10nService;
    }

    @Override
    public PerformResult perform(final HelloWorldCronJobModel cronJob)
    {

        for (int i = 0; i <= 2; i++)
        {
            try
            {
                System.out.println("Greeting '" + l10nService.getLocalizedString(cronJob.toString())
                        + "' from MyJobPerformable for " + i + " times.");
                Thread.sleep(5000);
            }
            catch (final InterruptedException e)
            {
                Thread.currentThread().interrupt();
            }
        }
        //the following will be executed when the loop is finished
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }

}
