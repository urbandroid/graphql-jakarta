FROM openliberty/open-liberty:full-java11-openj9-ubi
COPY --chown=1001:0  deneme2-ear/target/deneme2-ear.ear /config/dropins/
COPY --chown=1001:0  openliberty/server.xml /config/
RUN configure.sh