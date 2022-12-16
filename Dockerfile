FROM quay.io/wildfly/wildfly:latest
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]
ADD target/learning-struts.war /opt/jboss/wildfly/standalone/deployments/
