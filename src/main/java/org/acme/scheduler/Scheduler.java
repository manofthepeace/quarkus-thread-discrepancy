package org.acme.scheduler;

import javax.inject.Inject;

import org.jboss.logging.Logger;

import io.quarkus.scheduler.Scheduled;

public class Scheduler {

    @Inject
    Logger log;

    @Scheduled(every = "5s")
    void myScheduledTask() {
        log.info("Running scheduled task");
    }

}
