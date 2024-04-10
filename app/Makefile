setup:
	./gradlew wrapper --gradle-version 8.4

clean:
	./gradlew clean

build:
	./gradlew clean build

install:
	./gradlew clean installDist

run-dist:
	@./build/install/app/bin/app

run:
	./gradlew run

lint:
	./gradlew checkstyleMain

check-updates:
	./gradlew dependencyUpdates

.PHONY: build