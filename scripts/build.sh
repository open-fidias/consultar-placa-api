#!/usr/bin/env bash

set -o nounset
set -o errexit
set -o pipefail

rm -Rf tmp-build
mkdir tmp-build

npx openapi-generator generate \
    --input-spec openapi.json \
    --generator-name java \
    --group-id br.com.fidias \
    --artifact-id consultar-placa-api \
    --output tmp-build \
    --api-package br.com.fidias.consultar_placa.api \
    --model-package br.com.fidias.consultar_placa.model \
    --config api-config.json \
    --artifact-version 1.0.0 \
    --skip-validate-spec \
    --minimal-update

cp tmp-build/README.md README.md
cp tmp-build/docs/*.md docs
cp -r tmp-build/src/** src
rm src/main/AndroidManifest.xml
cp tmp-build/pom.xml pom.xml

#git apply ApiClient.java.patch
