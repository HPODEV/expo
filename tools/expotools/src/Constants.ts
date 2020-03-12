import * as Directories from './Directories';

export const STAGING_HOST = 'staging.expo.io';
export const PRODUCTION_HOST = 'expo.io';

export const EXPO_DIR = Directories.getExpoRepositoryRootDir();
export const EXPOTOOLS_DIR = Directories.getExpotoolsDir();
export const IOS_DIR = Directories.getIosDir();
export const ANDROID_DIR = Directories.getAndroidDir();
export const TEMPLATES_DIR = Directories.getTemplatesDir();
export const PACKAGES_DIR = Directories.getPackagesDir();
export const VERSIONED_RN_IOS_DIR = Directories.getVersionedReactNativeIosDir();
