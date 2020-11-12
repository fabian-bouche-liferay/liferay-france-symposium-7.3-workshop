package com.liferay.samples.paris.symposium.concert.collection.infolist;

import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.info.list.provider.InfoListProvider;
import com.liferay.info.list.provider.InfoListProviderContext;
import com.liferay.info.pagination.Pagination;
import com.liferay.info.sort.Sort;
import com.liferay.portal.kernel.language.Language;

import java.util.List;
import java.util.Locale;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true,
		service = InfoListProvider.class
		)
public class PastConcertsInfolistProvider implements InfoListProvider<AssetEntry> {

	@Override
	public List<AssetEntry> getInfoList(InfoListProviderContext infoListProviderContext) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AssetEntry> getInfoList(InfoListProviderContext infoListProviderContext, Pagination pagination,
			Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getInfoListCount(InfoListProviderContext infoListProviderContext) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getLabel(Locale locale) {
		return language.get(locale, "past-concerts-collection");
	}

	@Reference
	private Language language;
	
}
