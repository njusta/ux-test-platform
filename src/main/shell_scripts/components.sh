#!/usr/bin/env bash

echo "component: $component"
echo "feature_branch: $feature_branch"

install_elements_sdk() {
echo -e "******************************\\n    Installing elements-sdk: $1   \\n******************************"
git clone https://github.com/Pearson-Higher-Ed/elements-sdk.git
cd elements-sdk
git checkout $1
npm install &>/dev/null
npm run build &>/dev/null
cp ~/build/Pearson-Higher-Ed/ux-test-platform/elements-sdk/build/dist.compounds.js ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/elementsSDK/functional/jsfiles/
cp ~/build/Pearson-Higher-Ed/ux-test-platform/elements-sdk/build/eventInstantiator.compounds.js ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/elementsSDK/functional/jsfiles/
cp ~/build/Pearson-Higher-Ed/ux-test-platform/elements-sdk/build/css/elements.css ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/elementsSDK/css/
cp -R ~/build/Pearson-Higher-Ed/ux-test-platform/elements-sdk/build/fonts ~/build/Pearson-Higher-Ed/ux-test-platform/
cp -R ~/build/Pearson-Higher-Ed/ux-test-platform/elements-sdk/build/icons ~/build/Pearson-Higher-Ed/ux-test-platform/
ls -ltr ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/elementsSDK/functional/jsfiles/
}

install_compounds_sdk() {
echo -e "******************************\\n    Installing compounds sdk: $1   \\n******************************"
cd ~/build/Pearson-Higher-Ed/ux-test-platform/
git clone https://github.com/Pearson-Higher-Ed/compounds.git &>/dev/null
cd compounds
git checkout $1
npm install &>/dev/null
npm run build &>/dev/null
cp ~/build/Pearson-Higher-Ed/ux-test-platform/compounds/build/dist.compounds.js ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/elementsSDK/functional/jsfiles/
cp ~/build/Pearson-Higher-Ed/ux-test-platform/compounds/build/eventInstantiator.compounds.js ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/elementsSDK/functional/jsfiles/
cp ~/build/Pearson-Higher-Ed/ux-test-platform/compounds/node_modules/pearson-elements/dist/css/elements.css ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/elementsSDK/css/
cp -R ~/build/Pearson-Higher-Ed/ux-test-platform/compounds/node_modules/pearson-elements/dist/fonts ~/build/Pearson-Higher-Ed/ux-test-platform/
cp -R ~/build/Pearson-Higher-Ed/ux-test-platform/compounds/node_modules/pearson-elements/dist/icons ~/build/Pearson-Higher-Ed/ux-test-platform/
}

install_elements() {
echo -e "******************************\\n    Installing elements: $1   \\n******************************"
cd ~/build/Pearson-Higher-Ed/ux-test-platform/
git clone https://github.com/Pearson-Higher-Ed/elements.git &>/dev/null
cd elements
git checkout $1
npm install &>/dev/null
npm run build &>/dev/null
cp ~/build/Pearson-Higher-Ed/ux-test-platform/elements/dist/css/elements.css ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/elementsSDK/css/
ls -ltr ~/build/Pearson-Higher-Ed/ux-test-platform/elements/dist/
cp -R ~/build/Pearson-Higher-Ed/ux-test-platform/elements/dist/fonts ~/build/Pearson-Higher-Ed/ux-test-platform/
cp -R ~/build/Pearson-Higher-Ed/ux-test-platform/elements/dist/icons ~/build/Pearson-Higher-Ed/ux-test-platform/
}

install_appHeader(){
echo -e "******************************\\n    Installing app-header: $1  \\n******************************"
git clone https://github.com/Pearson-Higher-Ed/app-header.git
cd app-header
git checkout $1
npm install &>/dev/null
npm run build &>/dev/null
cp ~/build/Pearson-Higher-Ed/ux-test-platform/app-header/build/dist.app-header.js ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/standAlone/jsfiles/appHeader/
cp -R ~/build/Pearson-Higher-Ed/ux-test-platform/app-header/node_modules/pearson-elements/dist/fonts ~/build/Pearson-Higher-Ed/ux-test-platform/
cp ~/build/Pearson-Higher-Ed/ux-test-platform/app-header/node_modules/pearson-elements/dist/css/elements.css ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/standAlone/css/appHeader/
cp -R ~/build/Pearson-Higher-Ed/ux-test-platform/app-header/images ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/standAlone/
ls -ltr ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/standAlone/jsfiles/appHeader/
}

install_contextualHelp(){
echo -e "******************************\\n    Installing contextual-help: $1   \\n******************************"
git clone https://github.com/Pearson-Higher-Ed/contextual-help.git
cd contextual-help
git checkout $1
npm install &>/dev/null
npm run build &>/dev/null
cp ~/build/Pearson-Higher-Ed/ux-test-platform/contextual-help/build/dist.contextual-help.js ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/standAlone/jsfiles/contextualHelp/
cp -R ~/build/Pearson-Higher-Ed/ux-test-platform/contextual-help/node_modules/pearson-elements/dist/fonts ~/build/Pearson-Higher-Ed/ux-test-platform/
cp -R ~/build/Pearson-Higher-Ed/ux-test-platform/contextual-help/node_modules/pearson-elements/dist/icons ~/build/Pearson-Higher-Ed/ux-test-platform/
cp ~/build/Pearson-Higher-Ed/ux-test-platform/contextual-help/node_modules/pearson-elements/dist/css/elements.css ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/standAlone/css/contextualHelp/
ls -ltr ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/standAlone/jsfiles/contextualHelp/
}

install_drawer(){
echo -e "******************************\\n    Installing drawer: $1   \\n******************************"
git clone https://github.com/Pearson-Higher-Ed/drawer.git
cd drawer
git checkout $1
npm install &>/dev/null
npm run build &>/dev/null
cp ~/build/Pearson-Higher-Ed/ux-test-platform/drawer/build/dist.drawer.js ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/standAlone/jsfiles/drawer/
ls -ltr ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/standAlone/jsfiles/drawer/
}

install_componentArchetype(){
echo -e "******************************\\n    Installing component-archetype: $1  \\n******************************"
git clone https://github.com/Pearson-Higher-Ed/component-archetype.git
cd component-archetype
git checkout $1
npm install &>/dev/null
npm run copy-utils
npm run build &>/dev/null
cp ~/build/Pearson-Higher-Ed/ux-test-platform/component-archetype/build/dist.component-name.js ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/standAlone/jsfiles/componentArchetype/
cp -R ~/build/Pearson-Higher-Ed/ux-test-platform/component-archetype/node_modules/pearson-elements/dist/fonts ~/build/Pearson-Higher-Ed/ux-test-platform/
cp ~/build/Pearson-Higher-Ed/ux-test-platform/component-archetype/node_modules/pearson-elements/dist/css/elements.css ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/standAlone/css/componentArchetype/
}

install_avatarDisplay(){
echo -e "******************************\\n    Installing avatar-display: $1    \\n******************************"
git clone https://github.com/Pearson-Higher-Ed/avatar-display.git
cd avatar-display
git checkout $1
npm install &>/dev/null
npm run copy-utils
npm run build &>/dev/null
cp ~/build/Pearson-Higher-Ed/ux-test-platform/avatar-display/build/dist.avatar-display.js ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/standAlone/jsfiles/avatarDisplay/
cp -R ~/build/Pearson-Higher-Ed/ux-test-platform/avatar-display/node_modules/pearson-elements/dist/fonts ~/build/Pearson-Higher-Ed/ux-test-platform/
cp ~/build/Pearson-Higher-Ed/ux-test-platform/avatar-display/node_modules/pearson-elements/dist/css/elements.css ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/standAlone/css/avatarDisplay/
ls -ltr ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/standAlone/jsfiles/avatarDisplay/
}

install_slider(){
echo -e "******************************\\n    Installing slider: $1    \\n******************************"
git clone https://github.com/Pearson-Higher-Ed/slider.git
cd slider
git checkout $1
npm install &>/dev/null
npm run copy-utils
npm run build &>/dev/null
cp ~/build/Pearson-Higher-Ed/ux-test-platform/slider/build/dist.slider.js ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/standAlone/jsfiles/slider/
cp ~/build/Pearson-Higher-Ed/ux-test-platform/slider/node_modules/pearson-elements/dist/css/elements.css ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/standAlone/css/slider/
cp ~/build/Pearson-Higher-Ed/ux-test-platform/slider/slider.css ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/standAlone/css/slider/
ls -ltr ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/standAlone/jsfiles/slider/
}

install_alerts(){
echo -e "******************************\\n    Installing alerts: $1   \\n******************************"
git clone https://github.com/Pearson-Higher-Ed/alerts.git
cd alerts
git checkout $1
npm install &>/dev/null
npm run copy-utils
npm run build &>/dev/null
cp ~/build/Pearson-Higher-Ed/ux-test-platform/alerts/build/dist.alerts.js ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/standAlone/jsfiles/alerts/
cp -R ~/build/Pearson-Higher-Ed/ux-test-platform/alerts/node_modules/pearson-elements/dist/fonts ~/build/Pearson-Higher-Ed/ux-test-platform/
cp -R ~/build/Pearson-Higher-Ed/ux-test-platform/alerts/node_modules/pearson-elements/dist/icons ~/build/Pearson-Higher-Ed/ux-test-platform/
cp ~/build/Pearson-Higher-Ed/ux-test-platform/alerts/node_modules/pearson-elements/dist/css/elements.css ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/standAlone/css/alerts/
ls -ltr ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/standAlone/jsfiles/alerts/
}

install_pagination(){
echo -e "******************************\\n    Installing pagination: $1    \\n******************************"
git clone https://github.com/Pearson-Higher-Ed/pagination.git
cd pagination
git checkout $1
npm install &>/dev/null
#npm run copy-utils
npm run build &>/dev/null
cp ~/build/Pearson-Higher-Ed/ux-test-platform/pagination/build/dist.pagination.js ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/standAlone/jsfiles/pagination/
cp ~/build/Pearson-Higher-Ed/ux-test-platform/pagination/build/eventInterface.pagination.js ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/standAlone/jsfiles/pagination/
cp -R ~/build/Pearson-Higher-Ed/ux-test-platform/pagination/node_modules/pearson-elements/dist/fonts ~/build/Pearson-Higher-Ed/ux-test-platform/
cp ~/build/Pearson-Higher-Ed/ux-test-platform/pagination/node_modules/pearson-elements/dist/css/elements.css ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/standAlone/css/pagination/
ls -ltr ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/standAlone/jsfiles/pagination/
}

install_modal(){
echo -e "******************************\\n    Installing modal: $1   \\n******************************"
git clone https://github.com/Pearson-Higher-Ed/modal.git
cd modal
git checkout $1
npm install &>/dev/null
npm run build &>/dev/null
cp ~/build/Pearson-Higher-Ed/ux-test-platform/modal/build/dist.modal.js ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/standAlone/jsfiles/modal/
cp ~/build/Pearson-Higher-Ed/ux-test-platform/modal/build/dev.modal.js ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/standAlone/jsfiles/modal/
cp -R ~/build/Pearson-Higher-Ed/ux-test-platform/modal/node_modules/pearson-elements/dist/fonts ~/build/Pearson-Higher-Ed/ux-test-platform/
cp -R ~/build/Pearson-Higher-Ed/ux-test-platform/modal/node_modules/pearson-elements/dist/icons ~/build/Pearson-Higher-Ed/ux-test-platform/
cp ~/build/Pearson-Higher-Ed/ux-test-platform/modal/node_modules/pearson-elements/dist/css/elements.css ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/standAlone/css/modal/
ls -ltr ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/standAlone/jsfiles/modal/
}

install_loadingIndicator(){
echo -e "******************************\\n    Installing loading Indicator: $1    \\n******************************"
git clone https://github.com/Pearson-Higher-Ed/loading-indicator.git
cd loading-indicator
git checkout $1
npm install &>/dev/null
npm run build &>/dev/null
cp ~/build/Pearson-Higher-Ed/ux-test-platform/loading-indicator/build/dist.loadingIndicator.js ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/standAlone/jsfiles/loadingIndicator/
cp ~/build/Pearson-Higher-Ed/ux-test-platform/loading-indicator/build/dev.loadingIndicator.js ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/standAlone/jsfiles/loadingIndicator/
cp -R ~/build/Pearson-Higher-Ed/ux-test-platform/loading-indicator/node_modules/pearson-elements/dist/fonts ~/build/Pearson-Higher-Ed/ux-test-platform/
cp -R ~/build/Pearson-Higher-Ed/ux-test-platform/loading-indicator/node_modules/pearson-elements/dist/icons ~/build/Pearson-Higher-Ed/ux-test-platform/
cp ~/build/Pearson-Higher-Ed/ux-test-platform/loading-indicator/node_modules/pearson-elements/dist/css/elements.css ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/standAlone/css/loadingIndicator/
ls -ltr ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/standAlone/jsfiles/loadingIndicator/
}

install_coachMark(){
echo -e "******************************\\n    Installing coach-mark: $1    \\n******************************"
git clone https://github.com/Pearson-Higher-Ed/coach-mark.git
cd coach-mark
git checkout $1
npm install &>/dev/null
npm run build &>/dev/null
cp ~/build/Pearson-Higher-Ed/ux-test-platform/coach-mark/build/dist.coach-mark.js ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/standAlone/jsfiles/coachMark/
cp ~/build/Pearson-Higher-Ed/ux-test-platform/coach-mark/build/dev.coach-mark.js ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/standAlone/jsfiles/coachMark/
cp -R ~/build/Pearson-Higher-Ed/ux-test-platform/coach-mark/node_modules/pearson-elements/dist/fonts ~/build/Pearson-Higher-Ed/ux-test-platform/
cp -R ~/build/Pearson-Higher-Ed/ux-test-platform/coach-mark/node_modules/pearson-elements/dist/icons ~/build/Pearson-Higher-Ed/ux-test-platform/
cp ~/build/Pearson-Higher-Ed/ux-test-platform/coach-mark/node_modules/pearson-elements/dist/css/elements.css ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/standAlone/css/coachMark/
ls -ltr ~/build/Pearson-Higher-Ed/ux-test-platform/src/main/java/standAlone/jsfiles/coachMark/
}

# Below conditions are to install the components specific to its feature branch.
if [[ $component == "elements-sdk" ]]
then
install_elements_sdk $feature_branch

elif [[ $component == "compounds" ]]
then
install_compounds_sdk $feature_branch

elif [[ $component == "elements" ]]
then
install_elements $feature_branch

elif [[ $component == "app-header" ]]
then
install_appHeader $feature_branch

elif [[ $component == "contextual-help" ]]
then
install_appHeader master
cd ..
install_contextualHelp $feature_branch

elif [[ $component == "drawer" ]]
then
install_drawer $feature_branch

elif [[ $component == "component-archetype" ]]
then
install_componentArchetype $feature_branch

elif [[ $component == "avatar-display" ]]
then
install_avatarDisplay $feature_branch

elif [[ $component == "slider" ]]
then
install_slider $feature_branch

elif [[ $component == "alerts" ]]
then
install_alerts $feature_branch

elif [[ $component == "pagination" ]]
then
install_pagination $feature_branch

elif [[ $component == "modal" ]]
then
install_modal $feature_branch

elif [[ $component == "loading-indicator" ]]
then
install_loadingIndicator $feature_branch

elif [[ $component == "coach-mark" ]]
then
install_coachMark $feature_branch

# Below condition is to install all the "master" branch of components for the regression test run, regression split into 3 suites
elif [[ $component == "regression" ]]
then
install_appHeader master &
install_drawer master &
install_contextualHelp master &
install_avatarDisplay master &
install_slider master &
#install_alerts master &
#install_pagination master &
#install_modal master &
#install_loadingIndicator master &
#install_coachMark master &
#install_elements_sdk master &
fi
jobs -l
wait
jobs -l